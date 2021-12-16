#Autor: xxxxxxxxxxxxxxxxxx
  @stories
  Feature: Academy Choucair
    As a user, I want  to learn how to automate in screamplay at the Choucair academy with the automation course
    @scenario1
    Scenario: search for a automation course
      Given than brandon wants to learn automation at the academy Choucair
      | strUser   | strPassword |
      | TuUsuario | TuClave     |
      When he search for the course Certified Data &amp; Analytics Tester (CDAT) on the Choucair academy platform
      |strCourse            |
      |Metodologia Analytics|
      Then he finds the course called resources Certified Data &amp; Analytics Tester (CDAT)
      |str Course           |
      |Metodologia Analytics|