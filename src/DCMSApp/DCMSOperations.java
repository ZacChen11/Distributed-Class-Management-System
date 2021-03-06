package DCMSApp;


/**
* DCMSApp/DCMSOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from E:/Eclipse/workspace/COMP6231_Project/src/DCMS.idl
* Friday, July 28, 2017 10:51:04 o'clock AM EDT
*/

public interface DCMSOperations 
{

  //create teacher record
  String createTRecord (String managerID, String firstName, String lastName, String address, String phone, String specialization, String location);

  //create student record
  String createSRecord (String managerID, String firstName, String lastName, String courseRegistered, String status, String statusDate);

  //get record counts
  String getRecordCounts (String managerID);

  //edit record
  String editRecord (String managerID, String recordID, String fieldName, String newValue);

  //transfer record to another server
  String transferRecord (String managerID, String recordID, String remoteCenterServerName);
} // interface DCMSOperations
