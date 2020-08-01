package day_6_25_2020;

import java.util.Scanner;
/*
HTTP is the protocol that governs communications between web servers and web clients (i.e. browsers). Part of the protocol includes a status code returned by the server to tell the browser the status of its most recent page request. Some of the codes and their meanings are listed below:


STATUS CODES
200, OK
201, Created
202, Accepted
301, Moved Permanently
303, See Other
304, Not Modified
307, Temporary Redirect
400, Bad Request
401, Unauthorized
403, Forbidden
404, Not Found
410, Gone
500, Internal Server Error
503, Service Unavailable

Given an int variable status, write a switch statement that prints out, on a line by itself, the appropriate label from the above list based on status. Otherwise, print warning message: "Invalid status code!".

Example:
Display message: "Enter status code:"
input: 200
Display message: "OK"
 */
public class StatusCode {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter status code:");
        int code = scan.nextInt();
        String statusCode = "";

        if(code==200){
            statusCode = "Ok";
        } else if( code==201 ){
            statusCode = "Created";
        } else if(code==202){
            statusCode = "Accepted";
        } else if(code==301){
            statusCode = "Moved Permanently";
        } else if(code==303){
            statusCode = "See Other";
        }else if( code==304 ){
            statusCode = "Not Modified";
        } else if(code==307){
            statusCode = "Temporary Redirect";
        } else if(code==400){
            statusCode = "Bad Request";
        } else if(code==401){
            statusCode = "Unauthorized";
        }else if( code==403 ){
            statusCode = "Forbidden";
        } else if(code==404){
            statusCode = "Not Found";
        } else if(code==410){
            statusCode = "Gone";
        } else if(code==500){
            statusCode = "Internal Server Error";
        }else if (code==503){
            statusCode = "Service Unavailable";
        } else{
            statusCode = "Invalid";
        }

        System.out.println(statusCode);





    }
}
