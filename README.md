# coffee shop

this project used to create beverage type and customer and order for coffee shop

prerequired software

1.jdk 1.8
2.spring boot
3. mysql install

"# installing project software"

after installing mysql create scema with test and run the attached schema

# classs details

Order class - which hold order of the customer and beverage which is ordered by customer with order reference which will give
day wise report for the customer based on order date custom , Order status which will donates cancel or sold

Customer class - which used to create customer given basic information based on fulname/name or mobile number

Beverage class - which is used to create types bevarages like coffee, cappission latte


# controller

Order Controller - this is accept order and cancel order based on order_ref or Beverage name and customer name or customer mobile

Customer Controller - this is class used to create/update/remove/find  customer


Beverage Controller - used to create/update/find/delete Beverage on rest url


for example 
*BeverageController

# Repository 

for reposiry class used to do CRUD operation


# Test casses

*  for Controller can be used for restassured api for testing 
* for service mockito used to test functionaliy



for example:
 * BeverageControllerTest
* BeverageServiceTest

