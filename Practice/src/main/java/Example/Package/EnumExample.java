package Example.Package;


	enum Company
	{
		EBAY(30),GOOGLE(20),MICROSOFT(15);
		private int value;
		private Company(int value)
		{
			this.value = value;
		}
		public int getValue()
		{
			return value;
		}
	}
	


