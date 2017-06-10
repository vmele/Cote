package service.impl;

import java.util.ArrayList;
import java.util.List;

import business.Client;
import business.Utilisateur;
import dao.ClientDao;
import dao.impl.ClientDaoImpl;
import service.ClientService;

public class ClientServiceImpl implements ClientService {

	private ClientDao ClientDaoImpl;
	
	public ClientServiceImpl() throws Exception
	{
		super();
	//	System.out.println("Constructeur ClientServiceImpl");
		this.ClientDaoImpl = new ClientDaoImpl();
	}
	
	@Override
	public Client recupererClientParID(int idClient)
	{
		Client Client;

		Client = ClientDaoImpl.findClientById(idClient);

		return Client;
	}

	@Override
	public List<Client> recupererListeClients()
	{
		List<Client> listeClients = new ArrayList<Client>();

		listeClients = ClientDaoImpl.findAllClients();

		return listeClients;
	}
	
	@Override
	public List<Client> recupererClientParRS(String raisonSociale)
	{
		List<Client> listeClients = new ArrayList<Client>();

		listeClients = ClientDaoImpl.findClientByRS(raisonSociale);

		return listeClients;
	}

}
