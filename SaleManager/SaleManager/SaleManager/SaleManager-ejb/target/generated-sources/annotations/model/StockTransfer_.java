package model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(StockTransfer.class)
public abstract class StockTransfer_ {

	public static volatile SingularAttribute<StockTransfer, String> toStockID;
	public static volatile SingularAttribute<StockTransfer, Long> totalAmt;
	public static volatile SingularAttribute<StockTransfer, String> transID;
	public static volatile SingularAttribute<StockTransfer, String> fromStockID;
	public static volatile SingularAttribute<StockTransfer, Date> transDate;
	public static volatile SingularAttribute<StockTransfer, String> description;

}

