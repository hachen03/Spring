package Controller;

import Dao.DaoFactory;
import Dao.implDao;
import Dao.porderDao;
import Model.ModelFactory;
import Model.porder;

public class test {

	public static void main(String[] args) {
		//DaoFactory d=implDao.a2.getBean("DF",DaoFactory.class);
		ModelFactory m=implDao.a1.getBean("f",ModelFactory.class);
        
	}

}