import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Router } from '@angular/router';

@Component({
  selector: 'app-order',
  templateUrl: './order.component.html',
  styleUrls: ['./order.component.css']
})
export class OrderComponent implements OnInit {

  form: any = {
    data: {} 
  };

  constructor(private httpService: HttpClient,private route:Router) { }

  ngOnInit() {
    this.display();
  }

  save() {
    this.httpService.post('http://localhost:8084/Order/save', this.form.data)
      .subscribe(
        (res: any) => {
          this.form.message = res.result.message;
          if (res.success) {
            this.form.data = res.result.data;
          }
        },
        error => {
          console.error('Error occurred while saving:', error);
        }
      );
  }  

  display(){

    var self = this
    this.httpService.get("http://localhost:8084/Order/get"+this.form.data.id).subscribe((res:any)=>{
     self.form.data =   res.result.data;
    }
    )
    
  }

}
