package com.kt.advance.api;

import com.kt.advance.Util;
import com.kt.advance.xml.model.ApiXml.ApiAssumptionNode;

import kt.advance.model.PredicatesFactory.CPOPredicate;

public class ApiAssumption {

    public final Integer index;

    public final CPOPredicate predicate;

    public final Integer[] ppos;
    public final Integer[] spos;

    public ApiAssumption(ApiAssumptionNode node, CFunction fun) {

        this.ppos = Util.splitStringIntoIntegers(node.ppos);
        this.spos = Util.splitStringIntoIntegers(node.spos);

        this.predicate = fun.getCfile().getPredicate(node.predicateIndex);

        this.index = node.predicateIndex;

    }
}