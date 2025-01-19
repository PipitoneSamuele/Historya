import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-facts',
  templateUrl: './facts.component.html',
  styleUrl: './facts.component.css'
})
export class FactsComponent implements OnInit {

  facts: any;

  constructor(private http : HttpClient){};

  ngOnInit() {
    this.http.get<any>('http://client-service.svc.cluster.local:80') //bisogna creare il facts-service
    .subscribe(x => this.facts = x);
    console.log(JSON.stringify(this.facts));
  }

}
