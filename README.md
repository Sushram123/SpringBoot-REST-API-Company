Spring Boot Api:- EndPoints

Post:- http://localhost:8080/companies/
{
  "companyName": "New Company",
  "email": "new@example.com",
  "strength": 100,
  "webSiteURL": "http://new-website.com",
  "companyCode": "ABC12E"
}

Get:- http://localhost:8080/companies/{id}


Get:-http://localhost:8080/companies/byCode
      (http://localhost:8080/companies/byCode?companyCode=AB12E)
      

Patch:- http://localhost:8080/companies/{id}
{
  "companyName": "Updated Company Name",
  "email": "updated@example.com",
  "strength": 50,
  "webSiteURL": "http://updated-website.com",
  "companyCode": "ABC12E"
}
