public class Main{
	public static void main(String[] args){
		User user1 = new User("Salavat", UserRole.USER,17);
		User user2 = new User("Anya", UserRole.ADMIN,21);
		User user3 = new User("Mikhail", UserRole.MODERATOR,35);
		
		User[] users = {user1, user2, user3};
		
		Action action = new Action(){
			@Override
			public void execute(User user){
				try{
					user.checkAge();
					
					if (user.getRole() == UserRole.USER){
						System.out.println(user.getUserName() + " простой смертный");
					} else if (user.getRole() == UserRole.MODERATOR){
						System.out.println(user.getUserName() + " майор");
					} else if (user.getRole() == UserRole.ADMIN){
						System.out.println(user.getUserName() + " генерал");
					}
				} catch (IllegalArgumentException e){
					System.out.println("ОШИБКА " + e.getMessage());
				}
				
				
			}
		};
		
		for (int i = 0; i < users.length; i++){
			action.execute(users[i]);
		}
	}
}
