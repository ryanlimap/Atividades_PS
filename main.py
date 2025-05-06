# main.py
from fastapi import FastAPI
from controllers.operations import router as operations_router

app = FastAPI()

# Registrar os endpoints
app.include_router(operations_router)