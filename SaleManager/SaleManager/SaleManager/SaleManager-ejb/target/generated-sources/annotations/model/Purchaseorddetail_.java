package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Purchaseorddetail.class)
public abstract class Purchaseorddetail_ {

	public static volatile SingularAttribute<Purchaseorddetail, Long> amount;
	public static volatile SingularAttribute<Purchaseorddetail, Integer> orderNo;
	public static volatile SingularAttribute<Purchaseorddetail, String> qty;
	public static volatile SingularAttribute<Purchaseorddetail, Integer> qtyProm;
	public static volatile SingularAttribute<Purchaseorddetail, Integer> qtyPromAmt;
	public static volatile SingularAttribute<Purchaseorddetail, String> stockID;
	public static volatile SingularAttribute<Purchaseorddetail, Long> purchasePrice;
	public static volatile SingularAttribute<Purchaseorddetail, String> invtID;
	public static volatile SingularAttribute<Purchaseorddetail, Long> amtProm;
	public static volatile SingularAttribute<Purchaseorddetail, Long> taxAmt;

}

