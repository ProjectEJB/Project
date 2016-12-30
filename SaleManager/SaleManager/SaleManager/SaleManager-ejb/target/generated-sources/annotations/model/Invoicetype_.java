package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Invoicetype.class)
public abstract class Invoicetype_ {

	public static volatile CollectionAttribute<Invoicetype, Salesorder> salesorderCollection;
	public static volatile SingularAttribute<Invoicetype, String> typeName;
	public static volatile SingularAttribute<Invoicetype, String> invoiceType;

}

