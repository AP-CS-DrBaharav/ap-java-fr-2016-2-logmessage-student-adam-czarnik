public class LogMessage
{
  private String machineId;
  private String description;

  /* Part (a) */

  public LogMessage(String message) {
      int idx = 0;
      for (int i=0; i<message.length()-1; ++i) {
          if (message.substring(i,i+1).compareTo(":") == 0)
              idx = i;
      }
         machineId = message.substring(0,idx);
         description = message.substring(idx+1);
  }
          
  /* Part (b) */

  public boolean containsWord(String keyword) {

      for (int i=0; i<description.length()-keyword.length(); ++i) {
          if (description.substring(i,i+keyword.length()).compareTo(keyword)==0) {
              if (i==0 || description.substring(i-1,i).compareTo(" ")==0) {
                  return true;
              } else if (i==description.length()-keyword.length()-1 || description.substring(i+keyword.length(),i+1+keyword.length()).compareTo(" ")==0) {
                  return true;
              } else {
                  return false;
              }
          }
      }
        return false;  
  }    

  public String getMachineId()
  { return machineId; }

  public String getDescription()
  { return description; }

  public String toString()
  {
    return getMachineId() + ":" + getDescription();
  }
}
