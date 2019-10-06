import asyncio
import time

async def say_something_async(delay, messagepassed):
    await asyncio.sleep(delay)
    print(messagepassed)

async def main():
    print(" This function started at {time.strftime('%X')}")
    await say_something_async (1, 'Hello World')
    await say_something_async (2, 'Happy Coding')
    print("This function finished at {time.strftime('%X')}")

asyncio.run(main())
