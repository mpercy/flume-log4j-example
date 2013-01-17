package com.cloudera.flume.flumelog4jtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import org.apache.log4j.Logger;

public class LogTestApp {

  public static void main(String[] args) throws IOException {
    Logger logger = Logger.getLogger(LogTestApp.class);
    BufferedReader in = new BufferedReader(
        new InputStreamReader(System.in, Charset.forName("UTF-8")));
    String line;

    System.out.println("Initializing Flume log4j appender test.");
    System.out.println("Each line entered will be sent to Flume.");

    // send this line to Flume
    logger.info("LogTestApp initialized");

    while ((line = in.readLine()) != null) {
      System.out.println("Sending to log4j: " + line);
      logger.info(line);
    }
  }
}
