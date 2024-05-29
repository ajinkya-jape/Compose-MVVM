package com.ajinkyajape.jetpackcomposemvvm.mvvm.view

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import com.ajinkyajape.jetpackcomposemvvm.mvvm.model.EmployessResponse
import com.ajinkyajape.jetpackcomposemvvm.mvvm.viewmodel.CreditCardsViewModel

@Composable
fun CreditCardView(viewModel: CreditCardsViewModel) {

    val creditCardData by viewModel.creditCardDataList.observeAsState(null)
    
    LaunchedEffect(Unit){
        viewModel.getCreditCards()
    }

    Column {
        if(creditCardData == null){
            Text("Please wait...")
        }else{
            InitCreditCardDetails(creditCardData!!)
        }
    }

}

@Composable
fun InitCreditCardDetails(employessResponse: EmployessResponse){

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        ) {

        Column(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth()
        ) {
            Text(text = "Employee Name : ${employessResponse.employee_name}")
            TextStyle.Default
            Spacer(modifier = Modifier.height(8.dp))

            Text(text = "Employee Salary Date : ${employessResponse.employee_salary}")
            TextStyle.Default
            Spacer(modifier = Modifier.height(8.dp))

            Text(text = "Employee Age : ${employessResponse.employee_age}")
            TextStyle.Default
            Spacer(modifier = Modifier.height(8.dp))


        }


    }

}


