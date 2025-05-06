from fastapi import FastAPI
from pydantic import BaseModel

app = FastAPI()

class Calculator:
    def __init__(self, value1, value2):
        self.value1 = value1
        self.value2 = value2

    def add(self):
        return self.value1 + self.value2

    def subtract(self):
        return self.value1 - self.value2

    def multiply(self):
        return self.value1 * self.value2

    def divide(self):
        if self.value2 != 0:
            return self.value1 / self.value2
        else:
            return "Error: Division by zero is not allowed."

class OperationRequest(BaseModel):
    value1: float
    value2: float

@app.post("/add")
def add_numbers(request: OperationRequest):
    calc = Calculator(request.value1, request.value2)
    return {"result": calc.add()}

@app.post("/subtract")
def subtract_numbers(request: OperationRequest):
    calc = Calculator(request.value1, request.value2)
    return {"result": calc.subtract()}

@app.post("/multiply")
def multiply_numbers(request: OperationRequest):
    calc = Calculator(request.value1, request.value2)
    return {"result": calc.multiply()}

@app.post("/divide")
def divide_numbers(request: OperationRequest):
    calc = Calculator(request.value1, request.value2)
    return {"result": calc.divide()}