package com.cts.GrizzlyStoreHibernate.main;

import java.util.List;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.cts.GrizzlyStoreHibernate.bean.Category;
import com.cts.GrizzlyStoreHibernate.bean.Login;
import com.cts.GrizzlyStoreHibernate.bean.Product;
import com.cts.GrizzlyStoreHibernate.bean.Vendors;
import com.cts.GrizzlyStoreHibernate.service.CategoryService;
import com.cts.GrizzlyStoreHibernate.service.CategoryServiceImpl;
import com.cts.GrizzlyStoreHibernate.service.ProductService;
import com.cts.GrizzlyStoreHibernate.service.ProductServiceImpl;
import com.cts.GrizzlyStoreHibernate.service.VendorService;
import com.cts.GrizzlyStoreHibernate.service.VendorServiceImpl;
import com.cts.GrizzlyStoreHibernate.service.LoginService;
import com.cts.GrizzlyStoreHibernate.service.LoginServiceImpl;

public class main {

	public static void main(String[] args)
	{
		System.out.println("hi from vinne");
		
		Category category1 = new Category();
		Category category2 = new Category();
		Category category3 = new Category();
		Category category4 = new Category();
		Category category5 = new Category();

		Login login1 = new Login();
		Login login2 = new Login();
		Login login3 = new Login();
		Login login4 = new Login();
		Login login5 = new Login();
		
		Product product1 = new Product();
		Product product2 = new Product();
		Product product3 = new Product();
		Product product4 = new Product();
		Product product5 = new Product();
		
		Vendors vendors1 = new Vendors();
		Vendors vendors2 = new Vendors();
		Vendors vendors3 = new Vendors();
		Vendors vendors4 = new Vendors();
		Vendors vendors5 = new Vendors();
		
		CategoryService category_service = new CategoryServiceImpl();
		LoginService service_service = new LoginServiceImpl();
		ProductService product_service = new ProductServiceImpl();
		VendorService vendor_service = new VendorServiceImpl();
		
		category1.setName("Electronics");
		category1.setCategoryid("C_101");
		category_service.insertCategory(category1);
		
		vendors1.setId("V_301");
		vendors1.setName("M/S Shiv");
		vendors1.setContactno("987795225");
		vendors1.setAddress("Pune");
		vendor_service.insertVendors(vendors1);
		
		category2.setName("Mechanical");
		category2.setCategoryid("C_102");
		category_service.insertCategory(category2);
		
		category3.setName("Shaving");
		category3.setCategoryid("C_103");
		category_service.insertCategory(category3);
		
		category4.setName("Hair Cutting");
		category4.setCategoryid("C_104");
		category_service.insertCategory(category4);
		
				
		product1.setProductid("P_201");
		product1.setCategoryId("C_101");
		product1.setName("Trimmer");
		product1.setDescription("Good");
		product1.setPrice(5894);
		product1.setBrand("Philips");
		product1.setCategory(category1);
		product_service.insertProduct(product1);
		
		product2.setProductid("P_202");
		product2.setCategoryId("C_102");
		product2.setName("Scissor");
		product2.setDescription("Nice");
		product2.setPrice(5686);
		product2.setBrand("Desgh");
		product2.setCategory(category2);
		product_service.insertProduct(product2);
		
		product3.setProductid("P_203");
		product3.setCategoryId("C_103");
		product3.setName("Shirt");
		product3.setDescription("Very Good");
		product3.setPrice(1000);
		product3.setBrand("Reebok");
		product3.setCategory(category3);
		product_service.insertProduct(product3);
		
		
		product4.setProductid("P_204");
		product4.setCategoryId("C_104");
		product4.setName("Shoes");
		product4.setDescription("Pretty");
		product4.setPrice(85976);
		product4.setBrand("Puma");
		product4.setCategory(category4);
		product_service.insertProduct(product4);
		
		
		
		
		vendors1.setId("V_301");
		vendors1.setName("M/S Shiv");
		vendors1.setContactno("987795225");
		vendors1.setAddress("Pune");
		vendor_service.insertVendors(vendors1);
		
		vendors2.setId("V_302");
		vendors2.setName("M/S Bhakt");
		vendors2.setContactno("89755222");
		vendors2.setAddress("Lucknow");
		vendor_service.insertVendors(vendors2);

		vendors3.setId("V_303");
		vendors3.setName("M/S Bhagat");
		vendors3.setContactno("7899");
		vendors3.setAddress("Mumbai");
		vendor_service.insertVendors(vendors3);
		
		vendors4.setId("V_304");
		vendors4.setName("M/S Shakti");
		vendors4.setContactno("8632145");
		vendors4.setAddress("Bhoipal");
		vendor_service.insertVendors(vendors4);
		
		vendors5.setId("V_305");
		vendors5.setName("M/S Suman");
		vendors5.setContactno("24465686");
		vendors5.setAddress("Delhi");
		vendor_service.insertVendors(vendors5);

		//System.out.println("CATEGORY METHODS----------");
		//category_service.getAllCategory();
		//category_service.getCategoryName();

		System.out.println("PRODUCT METHODS----------");
		System.out.println(product_service.getAllProduct());
		product_service.getAllProduct();
		
		//System.out.println("VENDOR METHODS----------");
		//vendor_service.getAllVendors();
	}
}
