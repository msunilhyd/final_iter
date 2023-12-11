'use strict';

const puppeteer = require('puppeteer');
const fs = require('fs');

(async function main() {
  try {
    const browser = await puppeteer.launch({ headless: true });
    const [page] = await browser.pages();

    await page.goto('https://www.goal.com/en-us/fixtures/2023-12-09');
    
    const cdp = await page.target().createCDPSession();
    const { data } = await cdp.send('Page.captureScreenshot', { format: 'mhtml '});

    fs.writeFileSync('page.mhtml', data);

    await browser.close();
  } catch (err) {
    console.log(err);
  }
}) ();