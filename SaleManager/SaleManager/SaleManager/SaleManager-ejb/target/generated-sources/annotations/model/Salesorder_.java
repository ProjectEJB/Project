package model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Salesorder.class)
public abstract class Salesorder_ {

	public static volatile SingularAttribute<Salesorder, Long> taxAmt;
	public static volatile SingularAttribute<Salesorder, String> orderNo;
	public static volatile SingularAttribute<Salesorder, Long> payment;
	public static volatile SingularAttribute<Salesorder, Long> debt;
	public static volatile SingularAttribute<Salesorder, String> description;
	public static volatile SingularAttribute<Salesorder, Long> orderDisc;
	public static volatile SingularAttribute<Salesorder, String> custID;
	public static volatile SingularAttribute<Salesorder, Date> orderDate;
	public static volatile SingularAttribute<Salesorder, Invoicetype> invoiceType;
	public static volatile SingularAttribute<Salesorder, Date> overdueDate;
	public static volatile SingularAttribute<Salesorder, Long> totalAmt;

}

