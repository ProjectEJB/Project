package model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Purchaseorder.class)
public abstract class Purchaseorder_ {

	public static volatile SingularAttribute<Purchaseorder, String> orderType;
	public static volatile SingularAttribute<Purchaseorder, Date> overdueDate;
	public static volatile SingularAttribute<Purchaseorder, Long> amount;
	public static volatile SingularAttribute<Purchaseorder, Integer> orderNo;
	public static volatile SingularAttribute<Purchaseorder, Long> proAmt;
	public static volatile SingularAttribute<Purchaseorder, Long> comAmt;
	public static volatile SingularAttribute<Purchaseorder, Date> orderDate;
	public static volatile SingularAttribute<Purchaseorder, Long> discAmt;
	public static volatile SingularAttribute<Purchaseorder, Long> taxAmt;

}

