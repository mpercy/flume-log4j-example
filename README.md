flume-log4j-example
===================

Example of running the flume log4j appender using CDH4 Flume.

To compile:

  mvn clean package

To run:

  java -cp target/flumelog4jtest-1.0-jar-with-dependencies.jar com.cloudera.flume.flumelog4jtest.LogTestApp

An example Flume agent configuration file is provided in the flume.avro-mem-logger.properties file.
