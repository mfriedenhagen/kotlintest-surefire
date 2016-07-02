# Test project for kotlintest/kotlintest#42


This project contains a `FunSpec`, a `ShouldSpec` and a plain `JUnit` implementation of three simple tests:
* one failing test because of an assertion
* one erring test because of an exception
* one successful test.

The `JUnitTest` should be the reference here to be backwards-compatible with e.g. `surefire` or IDE runners.

With `kotlintest:1.2.0` the following may be seen when running `mvn -B -q clean test` (see https://travis-ci.org/mfriedenhagen/kotlintest-surefire as well):
* `JUnitTest` shows (correctly) **three** run tests in total, one of which is failing and one of which is erring.
* `FunSpecTest` and `ShouldSpecTest` show (incorrectly) **five** run tests, two of are shown as erring.

Reproduces: https://github.com/kotlintest/kotlintest/issues/42

[![Build Status](https://travis-ci.org/mfriedenhagen/kotlintest-surefire.svg?branch=master)](https://travis-ci.org/mfriedenhagen/kotlintest-surefire)
