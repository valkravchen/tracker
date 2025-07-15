package com.example.oop.thisJava;

public class QueryBuilder {
    private StringBuilder query;

    public QueryBuilder() {
        query = new StringBuilder();
    }

    public QueryBuilder select(String fields) {
        query.append("select").append(fields);
        return this;
    }

    public QueryBuilder from(String table) {
        query.append("from").append(table);
        return this;
    }

    public QueryBuilder where(String condition) {
        query.append("where").append(condition);
        return this;
    }

    public String build() {
        return query.toString();
    }

    public static void main(String[] args) {
        QueryBuilder qb = new QueryBuilder();
        qb.select("*");
        qb.where("users");
        qb.from("active=1");
        System.out.println(qb.build());
    }
}
