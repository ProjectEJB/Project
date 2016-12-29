package model;

import java.math.BigInteger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Purchaseorder.class)
public abstract class Purchaseorder_ {

	public static volatile SingularAttribute<Purchaseorder, String> orderType;
	public static volatile SingularAttribute<Purchaseorder, Date> overdueDate;
	public static volatile SingularAttribute<Purchaseorder, BigInteger> amount;
	public static volatile SingularAttribute<Purchaseorder, Integer> orderNo;
	public static volatile SingularAttribute<Purchaseorder, BigInteger> comAmt;
	public static volatile SingularAttribute<Purchaseorder, BigInteger> promAmt;
	public static volatile SingularAttribute<Purchaseorder, BigInteger> discAmt;
	public static volatile SingularAttribute<Purchaseorder, Date> orderDate;
	public static volatile SingularAttribute<Purchaseorder, BigInteger> taxAmt;

}

