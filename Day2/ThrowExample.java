class ThorwExample
{
  public void checkEligibility(int s_age,int s_weight)
  {
    if(s_age<20 && s_weight<40)
    throw new AirthematicException("Student is not Allowed");
  }
}
