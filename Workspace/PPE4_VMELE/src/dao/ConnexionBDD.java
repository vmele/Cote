package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Commentaire OK
 * @author mathieu
 *
 */
public class ConnexionBDD
{

	/**
	 * D�claration des constantes de ConnexionBDD
	 */
	private static final String URL = "jdbc:postgresql://localhost:5432/e4_vmele";
	private static final String UTILISATEUR = "postgres";
	private static final String MOT_DE_PASSE = "postgres";
	private static Connection connexion;
	/*private static Statement statement;*/

	/**
	 * Accesseur de la connexion
	 * @return
	 */
	public static Connection getConnection()
	{

		if (connexion == null)
		{

			try
			{
				Class.forName("org.postgresql.Driver");
			}
			catch (ClassNotFoundException e1)
			{
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			try
			{
				connexion = DriverManager.getConnection(URL, UTILISATEUR, MOT_DE_PASSE);

			}
			catch (SQLException e)
			{

				e.printStackTrace();

			}

		}

		return connexion;

	}

	/** 
	 * Close la connexion
	 * @param statement
	 * @param preparedStatement
	 * @param resultat
	 */
	public static void close(Statement statement, PreparedStatement preparedStatement, ResultSet resultat)
	{
		if (resultat != null)
		{
			try
			{
				resultat.close();
			}
			catch (SQLException ignore)
			{

			}
		}

		if (preparedStatement != null)
		{
			try
			{
				preparedStatement.close();
			}
			catch (SQLException ignore)
			{

			}
		}

		if (statement != null)
		{
			try
			{
				statement.close();
			}
			catch (SQLException ignore)
			{

			}
		}
	}


	/**
	 * Close la co
	 * @param preparedStatement
	 * @param resultat
	 */
	public static void close(PreparedStatement preparedStatement, ResultSet resultat)
	{
		close(null, preparedStatement, resultat);
	}
}
