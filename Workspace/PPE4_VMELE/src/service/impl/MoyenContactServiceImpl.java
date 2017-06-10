package service.impl;

import java.util.ArrayList;
import java.util.List;

import business.MoyenContact;
import dao.MoyenContactDao;
import dao.impl.MoyenContactDaoImpl;
import service.MoyenContactService;

public class MoyenContactServiceImpl implements MoyenContactService {

	private MoyenContactDao MoyenContactDaoImpl;
	
	public MoyenContactServiceImpl() throws Exception
	{
		super();
	//	System.out.println("Constructeur MoyenContactServiceImpl");

		this.MoyenContactDaoImpl = new MoyenContactDaoImpl();
	}
	@Override
	public MoyenContact recupererMoyenContactParID(int idMoyenContact)
	{
		MoyenContact MoyenContact;

		MoyenContact = MoyenContactDaoImpl.findMoyenContactById(idMoyenContact);

		return MoyenContact;
	}

	@Override
	public List<MoyenContact> recupererListeMoyenContacts()
	{

		List<MoyenContact> listeMoyenContacts = new ArrayList<MoyenContact>();

		listeMoyenContacts = MoyenContactDaoImpl.findAllMoyenContacts();

		return listeMoyenContacts;
	}

}
