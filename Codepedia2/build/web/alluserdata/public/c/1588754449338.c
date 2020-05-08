void main(int argc, char* argv[])
{
  int sum=0;
  int p=atoi(argv[1]);
  for(int i=2;i<argc;i++)
  {
    int a=atoi(argv[i]);
    sum=sum+a;
    
  }
  printf("%d\n",sum);
}