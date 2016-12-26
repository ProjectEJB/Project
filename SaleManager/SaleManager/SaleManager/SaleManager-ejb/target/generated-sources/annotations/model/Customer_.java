package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Customer.class)
public abstract class Customer_ {

	public static volatile SingularAttribute<Customer, Long> dueAmt;
	public static volatile SingularAttribute<Customer, Long> amount;
	public static volatile SingularAttribute<Customer, String> address;
	public static volatile SingularAttribute<Customer, Integer> overdue;
	public static volatile SingularAttribute<Customer, String> phone;
	public static volatile SingularAttribute<Customer, String> custID;
	public static volatile SingularAttribute<Customer, String> description;
	public static volatile SingularAttribute<Customer, String> custName;
	public static volatile SingularAttribute<Customer, String> fax;
	public static volatile SingularAttribute<Customer, Long> overdueAmt;
	public static volatile SingularAttribute<Customer, String> email;
	public static volatile SingularAttribute<Customer, String> status;

}

