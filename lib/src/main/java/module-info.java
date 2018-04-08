module springboot.demo.lib {
  exports springboot.demo.lib.model to springboot.demo.rest;
  opens springboot.demo.lib.model;
}