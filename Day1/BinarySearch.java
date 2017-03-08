class BinarySearch
{
public static void main(String args[])
{
int list[]={2,4,5,6,7,9,10};
int key=11;
int low=0;
int flag=-1;
int high=(list.length)-1;
int mid=(low+high)/2;
//System.out.println(mid);
while(low<=high)
{
  if(key>list[mid])
  low=mid+1;
  else if(key<list[mid])
  high=mid-1;
  else
  {
System.out.println("Key Found at "+mid);
return ;
  }
  mid=(low+high)/2;
}
if(low>high)
System.out.println("Key Not Found");
}
}
