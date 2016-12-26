package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Purchaseorder.class)
public abstract class Purchaseorder_ {

	public static volatile SingularAttribute<Purchaseorder, Long> amount;
	public static volatile SingularAttribute<Purchaseorder, Integer> orderNo;
	public static volatile SingularAttribute<Purchaseorder, Integer> qty;
	public static volatile SingularAttribute<Purchaseorder, Integer> qtyProm;
	public static volatile SingularAttribute<Purchaseorder, Integer> qtyPromAmt;
	public static volatile SingularAttribute<Purchaseorder, String> stockID;
	public static volatile SingularAttribute<Purchaseorder, Long> purchasePrice;
	public static volatile SingularAttribute<Purchaseorder, String> invtID;
	public static volatile SingularAttribute<Purchaseorder, Long> amtProm;
	public static volatile SingularAttribute<Purchaseorder, Long> taxAmt;

}

