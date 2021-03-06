package com.loserico.orm.jpa.predicate;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Root;

public interface Predicate {

	public javax.persistence.criteria.Predicate toPredicate(CriteriaBuilder criteriaBuilder, Root root);
}
