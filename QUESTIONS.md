# Thoughts raised during implemetation

Very interesting assigment- no Spring, no other libraries- just vanilla Java (and JUnit ;) ).
In real world use case I'd search for ready implementation like `cron-parser` or sth, especially to handle all edgecases with valdiation. 

I focused mainly on presenting my OOP understanding.

It took me around 6h and I decided to finish on `minutes, hours, months` as it was decsribed in PDF: 
> If you do not have time to
handle all possible cron strings then an app which handles a subset of them correctly is
better than one which does not run or produces incorrect results.

But `dayOfMonth` would be very interesting case, because its maximum value depend on `month` value - probably I'd decide to handle it as single object to have access to both values for `getTimes()`

Task description mention about running it as single command, but I think providing gradle wrapper is enough. If no I'd do it with `./gradlew distZip` and providing distribution of `jar` file with instruction.