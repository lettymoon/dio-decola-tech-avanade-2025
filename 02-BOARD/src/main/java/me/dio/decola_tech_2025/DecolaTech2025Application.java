package me.dio.decola_tech_2025;

import me.dio.decola_tech_2025.persistence.migration.MigrationStrategy;
import me.dio.decola_tech_2025.ui.MainMenu;

import java.sql.SQLException;

import static me.dio.decola_tech_2025.persistence.config.ConnectionConfig.getConnection;

public class DecolaTech2025Application {

	public static void main(String[] args) throws SQLException {
		try(var connection = getConnection()){
			new MigrationStrategy(connection).executeMigration();
		}
		new MainMenu().execute();
	}

}
