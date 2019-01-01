//
//  ViewController.swift
//  dbgram-ios
//
//  Created by darel bitsy on 1/1/19.
//  Copyright © 2019 dbeginc. All rights reserved.
//

import UIKit
import domain

class ViewController: UIViewController {
    @IBOutlet weak var sampletext: UILabel!
    
    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view, typically from a nib.
        sampletext.text = SampleKt.hello()
    }


}

