export default function Footer() {
  return (
    <footer className="text-center bg-black text-white w-full mt-4">
      <div className="flex-col justify-center items-center mb-4">        
        <div className="mb-2 grid grid-cols-3 gap-4 justify-center items-center border-b border-gray-600 pb-4">
          <div className="mb-2 border-r order-gray-600 pr-4 flex flex-col gap-2">
            <a href="#" className="mx-2 hover:text-gray-400">TITLE</a> 
            <a href="#" className="mx-2 hover:text-gray-400">About Us</a> 
            <a href="#" className="mx-2 hover:text-gray-400">Contact</a> 
            <a href="#" className="mx-2 hover:text-gray-400">Privacy Policy</a>
            <a href="#" className="mx-2 hover:text-gray-400">Terms of Service</a>
          </div>
          <div className="mb-2 border-r border-gray-600 pr-4 flex flex-col gap-2">
            <a href="#" className="mx-2 hover:text-gray-400">Facebook</a> 
            <a href="#" className="mx-2 hover:text-gray-400">Twitter</a> 
            <a href="#" className="mx-2 hover:text-gray-400">Instagram</a> 
            <a href="#" className="mx-2 hover:text-gray-400">LinkedIn</a> 
          </div>
          <div className="mb-2 flex flex-col gap-2">
            <a href="#" className="mx-2 hover:text-gray-400">Help</a> 
            <a href="#" className="mx-2 hover:text-gray-400">Support</a>
            <a href="#" className="mx-2 hover:text-gray-400">Forums</a>
            <a href="#" className="mx-2 hover:text-gray-400">Blog</a>
          </div>
        </div>
        <div className="mb-2 grid grid-cols-2 gap-4 jusify-between items-center pb-4 "> 
          <div className="mb-2 flex justify-center items-center border-r order-gray-600 pr-4">
            <input type="email" placeholder="Enter your Email" className="p-2 rounded text-white w-1/2 border-b border-gray-300"/>
            <button className="m-4 p-2 pr-4 pl-4 border hover:text-black hover:bg-white">Subscribe</button> 
          </div>
          <div className="mb-2 flex justify-center items-center"> 
            <a href="#" className="mx-2 hover:text-gray-400">Careers</a>
            <a href="#" className="mx-2 hover:text-gray-400">Sitemap</a>      
          </div>
        </div>          
      </div>
      <div className="bg-white text-black rounded w-full p-2 pb-4 pt-4">
          <p>© 2024 Player Stats. All rights reserved.</p>
      </div>
    </footer>
  );
}