package model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Payment.class)
public abstract class Payment_ {

	public static volatile SingularAttribute<Payment, String> paymentNo;
	public static volatile SingularAttribute<Payment, Long> paymentAmt;
	public static volatile SingularAttribute<Payment, Integer> paymentID;
	public static volatile SingularAttribute<Payment, String> custID;
	public static volatile SingularAttribute<Payment, String> description;
	public static volatile SingularAttribute<Payment, Date> paymentDate;
	public static volatile SingularAttribute<Payment, String> salesPersonID;

}

