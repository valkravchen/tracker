package com.example.oop.thisJava;

public class QueryBuilder {
    private StringBuilder query;

    public QueryBuilder(StringBuilder query) {
        this.query = query;
    }

    public QueryBuilder select(String fields) {
        query.append("select").append(fields);
        return this;
    }

    public QueryBuilder from(String condition) {
        query.append("where").append(condition);
        return this;
    }

    public String build() {
        return query.toString();
    }
}
