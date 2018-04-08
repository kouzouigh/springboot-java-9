module springboot.demo.rest {

  requires spring.core;
  requires spring.beans;
  requires spring.context;
  requires spring.aop;
  requires spring.web;
  requires spring.expression;

  requires spring.boot;
  requires spring.boot.autoconfigure;

  requires springboot.demo.lib;

  exports springboot.demo.rest;
  exports springboot.demo.rest.resources;

  opens springboot.demo.rest;
  opens springboot.demo.rest.resources;
}