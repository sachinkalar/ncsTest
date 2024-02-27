import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Router } from '@angular/router';

@Component({
  selector: 'app-list',
  templateUrl: './list.component.html',
  styleUrls: ['./list.component.css']
})
export class ListComponent implements OnInit {

  form: any = {
    searchParams: {},
    list:[]
  }

  result: any = {};

  constructor(private httpClient: HttpClient,private route:Router) { }

  ngOnInit(): void {
    this.search();
  
  }

  search() {

    var self = this
    this.httpClient.post("http://localhost:8084/Order/search", this.form.searchParams).subscribe((res:any) => {
      self.form.list =res.result.data;
    })
  }

  forward(page:any){
    this.route.navigateByUrl(page)
  }

 

  

}
