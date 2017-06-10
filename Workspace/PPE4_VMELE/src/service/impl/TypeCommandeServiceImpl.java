package service.impl;

import java.util.ArrayList;
import java.util.List;

import business.TypeCommande;
import business.TypeCommande;
import dao.TypeCommandeDao;
import dao.impl.TypeCommandeDaoImpl;
import service.TypeCommandeService;

public class TypeCommandeServiceImpl implements TypeCommandeService {

	private TypeCommandeDao TypeCommandeDaoImpl;
	
	public TypeCommandeServiceImpl() throws Exception
	{
		super();
	//	System.out.println("Constructeur TypeCommandeServiceImpl");

		this.TypeCommandeDaoImpl = new TypeCommandeDaoImpl();
	}
	@Override
	public TypeCommande recupererTypeCommandeParID(int idTypeCommande)
	{
		TypeCommande TypeCommande;

		TypeCommande = TypeCommandeDaoImpl.findTypeCommandeById(idTypeCommande);

		return TypeCommande;
	}

	@Override
	public List<TypeCommande> recupererListeTypeCommandes()
	{

		List<TypeCommande> listeTypeCommandes = new ArrayList<TypeCommande>();

		listeTypeCommandes = TypeCommandeDaoImpl.findAllTypeCommandes();

		return listeTypeCommandes;
	}

}
