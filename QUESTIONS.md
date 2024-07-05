# Thoughts raised during implementation

Very interesting assigment- no Spring, no other libraries- just vanilla Java (and JUnit ;) ).
In real world use case I'd search for ready implementation like `cron-parser` or sth, especially to handle all edge cases with validation. 

I focused mainly on presenting my OOP understanding.

It took me around 6h and I decided to finish on `minutes, hours, months` as it was described in PDF: 
> If you do not have time to
handle all possible cron strings then an app which handles a subset of them correctly is
better than one which does not run or produces incorrect results.

But `dayOfMonth` is very interesting case, because its maximum value depend on `month` value - I'd decide to handle it as single object to have access to both values for `getTimes()`

In case of extra time after implementing all cases my first "optimization" would be a proper logger - this `System.out` was hurting my soul to write :D 

Task description mention about running it as single command, but I think providing gradle wrapper is enough. If no I'd do it with `./gradlew distZip` and providing distribution of `jar` file with instruction.
