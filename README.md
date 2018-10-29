# spring-ripper
Maven two modules project (parent and child)
Includes Custom Spring Boot starter

all steps based on lavcraft(K.Tolkachev) and his co-speaker (Jocker 2017),


Important: if use Inteliji Idea (i use v2016), need to install lombok and spring plugins,
                                               install sping assistant
                                               then turn on annotation processor


-Dspring.profiles.active=зимаТута       (active profile to  VM options)


Stuck on : @ConditionalOnProperty - doesn`t work - find suggestions,and suggestion is under
for module need to set <packaging> pom </packaging> - to set it of part of parents pom
