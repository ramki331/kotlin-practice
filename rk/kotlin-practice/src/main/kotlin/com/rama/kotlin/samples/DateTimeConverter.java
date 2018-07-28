package com.rama.kotlin.samples;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class DateTimeConverter {

    public static void main(final String[] args){

      DateTimeFormatter accertifyTimeFormatter = new DateTimeFormatterBuilder().
          appendPattern("yyyy-MM-dd'T'HH:mm:ssZZZ").toFormatter();

      //1
      DateTimeFormatter format = DateTimeFormatter.ISO_DATE_TIME;
      ZonedDateTime transactionTime = ZonedDateTime.parse("2018-04-03T17:48:38.428Z", format);
      System.out.println(transactionTime);
      System.out.println(transactionTime.format(accertifyTimeFormatter));

      //2
      DateTimeFormatter pickupTimeFormatter = new DateTimeFormatterBuilder().
          appendPattern("yyyy-MM-dd HH:mm").toFormatter();
      ZonedDateTime pickupTime = LocalDateTime.parse("2018-03-30 01:00", pickupTimeFormatter)
          .atZone(ZoneId.of("America/New_York"));
      System.out.println(pickupTime);
      System.out.println(pickupTime.format(accertifyTimeFormatter));

      //3
      DateTimeFormatter reservationTimeFormatter = new DateTimeFormatterBuilder().
          appendPattern("yyyy-MM-dd'T'HH:mm:ss").
          toFormatter();

      ZonedDateTime reservationExpiryTime = LocalDateTime
          .parse("2018-03-29T03:59:59", reservationTimeFormatter)
          .atZone(ZoneId.of("America/New_York"));
      System.out.println(reservationExpiryTime);
      System.out.println(reservationExpiryTime.format(accertifyTimeFormatter));


            /*

      --> OLD WAY

      final SimpleDateFormat f1 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
      Date parsed = f1.parse("2018-03-30T15:12:12.017Z");
      System.out.println(parsed);
      final SimpleDateFormat f2 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZZZ");
      f2.setTimeZone(TimeZone.getTimeZone("GMT"));
      System.out.println(f2.format(parsed));
      */

//
//      DateTimeFormatterBuilder builder1 = new DateTimeFormatterBuilder().
//          append(DateTimeFormatter.ISO_LOCAL_DATE_TIME).appendOffset("+HHMM","+0000");
//      System.out.println("1111"+transactionTime.format(builder1.toFormatter()));
//
//
//      Instant out = transactionTime.toInstant();
//      System.out.println(out.toString());
//
//
//
//      String s = DateTimeFormatter.ISO_DATE_TIME.
//          format(transactionTime);
//      System.out.println("s"+s);
//
//      String s1 = DateTimeFormatter.ISO_DATE.format(transactionTime);
//      System.out.println("s1"+s1);
//
//      try {
//        String s2 = transactionTime.format(DateTimeFormatter.ISO_ZONED_DATE_TIME);
//        System.out.println("s2" + s2);
//      }catch (Exception e) {
//
//      } try{
//
//      String s3 = DateTimeFormatter.ISO_INSTANT.format(transactionTime);
//      System.out.println("s3"+s3);
//      }catch (Exception e) {
//
//      } try{
//      String s4 = DateTimeFormatter.ISO_OFFSET_DATE.format(transactionTime);
//      System.out.println("s4"+s4);
//      }catch (Exception e) {
//
//      } try{
//      String s5 = DateTimeFormatter.ISO_LOCAL_DATE.format(transactionTime);
//      System.out.println("s5"+s5);
//      }catch (Exception e) {
//
//      } try{
//      String s6 = DateTimeFormatter.ISO_LOCAL_DATE_TIME.withZone(ZoneId.of("GMT")).
//          format(transactionTime);
//      System.out.println("s6"+s6);
//      }catch (Exception e) {
//
//      } try{
//      String s7 = DateTimeFormatter.ISO_LOCAL_TIME.format(transactionTime);
//      System.out.println("s7"+s7);
//      }catch (Exception e) {
//
//      } try{
//      String s8 = DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(transactionTime);
//      System.out.println("s8"+s8);
//      }catch (Exception e) {
//
//      } try{
//      String s9 = DateTimeFormatter.ISO_OFFSET_TIME.format(transactionTime);
//      System.out.println("s9"+s9);
//      }catch (Exception e) {
//
//      } try{
//      String s10 = DateTimeFormatter.ISO_TIME.format(transactionTime);
//      System.out.println("s10"+s10);
//      }catch (Exception e) {
//
//      } try{
//      String s11 = DateTimeFormatter.BASIC_ISO_DATE.format(transactionTime);
//      System.out.println("s11"+s11);
//      }catch (Exception e) {
//
//      }

    }
}
