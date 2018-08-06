$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("com/capg/ConferenceQ/calculator.feature");
formatter.feature({
  "line": 3,
  "name": "Calculator",
  "description": "I want to use this template for my feature file",
  "id": "calculator",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 8,
  "name": "Adding of two numbers \u003ca\u003e and \u003cb\u003e",
  "description": "",
  "id": "calculator;adding-of-two-numbers-\u003ca\u003e-and-\u003cb\u003e",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 7,
      "name": "@tag2"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "I have a calculator",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "I add \u003ca\u003e and \u003cb\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "the result should be \u003ca+b\u003e",
  "keyword": "Then "
});
formatter.examples({
  "line": 13,
  "name": "",
  "description": "",
  "id": "calculator;adding-of-two-numbers-\u003ca\u003e-and-\u003cb\u003e;",
  "rows": [
    {
      "cells": [
        "a",
        "b",
        "a+b"
      ],
      "line": 14,
      "id": "calculator;adding-of-two-numbers-\u003ca\u003e-and-\u003cb\u003e;;1"
    },
    {
      "cells": [
        "2",
        "5",
        "7"
      ],
      "line": 15,
      "id": "calculator;adding-of-two-numbers-\u003ca\u003e-and-\u003cb\u003e;;2"
    },
    {
      "cells": [
        "2",
        "7",
        "9"
      ],
      "line": 16,
      "id": "calculator;adding-of-two-numbers-\u003ca\u003e-and-\u003cb\u003e;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 15,
  "name": "Adding of two numbers 2 and 5",
  "description": "",
  "id": "calculator;adding-of-two-numbers-\u003ca\u003e-and-\u003cb\u003e;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 7,
      "name": "@tag2"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "I have a calculator",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "I add 2 and 5",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "the result should be 7",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "Calculator.i_have_a_calculator()"
});
formatter.result({
  "duration": 164173444,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 6
    },
    {
      "val": "5",
      "offset": 12
    }
  ],
  "location": "Calculator.i_add_and(int,int)"
});
formatter.result({
  "duration": 1969467,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "7",
      "offset": 21
    }
  ],
  "location": "Calculator.the_result_should_be(int)"
});
formatter.result({
  "duration": 106735,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Adding of two numbers 2 and 7",
  "description": "",
  "id": "calculator;adding-of-two-numbers-\u003ca\u003e-and-\u003cb\u003e;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 7,
      "name": "@tag2"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "I have a calculator",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "I add 2 and 7",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "the result should be 9",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "Calculator.i_have_a_calculator()"
});
formatter.result({
  "duration": 105195,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 6
    },
    {
      "val": "7",
      "offset": 12
    }
  ],
  "location": "Calculator.i_add_and(int,int)"
});
formatter.result({
  "duration": 114432,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "9",
      "offset": 21
    }
  ],
  "location": "Calculator.the_result_should_be(int)"
});
formatter.result({
  "duration": 71841,
  "status": "passed"
});
});