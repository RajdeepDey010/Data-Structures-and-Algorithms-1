import java.util.Scanner;
public class MarsExplore
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    String st = sc.next();
    int len = st.length();
    int cnt=0;
    for(int i=0;i<len;i=i+3)
    {
      for(int j=0;j<3;j++)
      {
        if(j%2 == 0)
        {
          if(st.charAt(i+j)!= 'S')
          {
              cnt++;
          }
        }
        else{
          if(st.charAt(i+j)!='O')
          {
            cnt++;
          }
        }
      }
    }
    System.out.println(cnt);
  }
}
