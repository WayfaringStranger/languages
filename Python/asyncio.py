import asyncio

async def main():
    print('Hello...')
    await asyncio.sleep(1)
    print('... World!')

# Python3.7+
asyncio.run(main())

