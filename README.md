# design-patterns

#Singleton Desgin Pattern
 1.Lazy Singleton Its easier way to create singleton class however it breaks in multithreaded environment
 
 	So Resolve Lazy Disadvantage we will use Thread Safety
 
 2. Synchronization 
   a.) on method level we can synchronoze keyword but it will dgrade the application performance
   b.) So will use double checking princple 
   
 Note :- we can break singleton design pattern by Reflection So we can use Enum